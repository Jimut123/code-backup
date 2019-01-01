// Listen for form submit
document.getElementById('myForm').addEventListener('submit',saveBookmark);
// Save Bookmark
function saveBookmark(e){
    // Get form values
    
    var siteName = document.getElementById('siteName').value;
    var siteURL = document.getElementById('siteURL').value;
    
    if(!validateForm(siteName,siteURL)){
        return false;
    }
    //console.log(siteName)
    //console.log(siteURL)
    
    var bookmark = {
        name:siteName,
        url:siteURL
    }
    //console.log(bookmark)

    /*
        // Local storage test
        localStorage.setItem('test','Hello World');
        console.log(localStorage.getItem('test'));
        localStorage.removeItem('test');
        console.log(localStorage.getItem('test'));
    */

    // test if bookmarks is null
    if(localStorage.getItem('bookmarks')===null){
        //initialise array
        var bookmarks = [];
        // add to array
        bookmarks.push(bookmark);
        // set to local storage
        // JSON to string
        localStorage.setItem('bookmarks',JSON.stringify(bookmarks));
    }
    else{
        // get bookmarks from local storage
        // string to JSON
        var bookmarks = JSON.parse(localStorage.getItem('bookmarks'));
        // add bookmark to array
        bookmarks.push(bookmark);

        // reset it back to local storage
        localStorage.setItem('bookmarks',JSON.stringify(bookmarks));
    }

    // clear form
    document.getElementById('myForm').reset();
    // re-fetch bookmarks
    fetchBookmarks();

    // prevent form from submitting
    e.preventDefault();
}

// Function to delete bookmark
function deleteBookmark(url)
{
    //console.log(url);
    // get bookmarks from local storage
    var bookmarks = JSON.parse(localStorage.getItem('bookmarks'));
    // loop through bookmarks
    for(var i=0;i<bookmarks.length;i++)
    {
        if(bookmarks[i].url == url){
            // remove from array
            bookmarks.splice(i,i);

        }
    }
    localStorage.setItem('bookmarks',JSON.stringify(bookmarks));

    // re-fetch bookmarks
    fetchBookmarks();
}
// Fetch bookmarks
function fetchBookmarks(){
    // get bookmarks from local storage
    var bookmarks = JSON.parse(localStorage.getItem('bookmarks'));
    //console.log(bookmarks);

    // get output id
    var bookmarksResults = document.getElementById('bookmarksResults');

    // build output
    bookmarksResults.innerHTML = '';
    for(var i = 0; i < bookmarks.length; i++){
        var name = bookmarks[i].name;
        var url = bookmarks[i].url;

        bookmarksResults.innerHTML += '<div class = "well well-sm">'+
                        '<h3>'+name+
                        '<a class = "btn btn-default" target = "_blank" href="'+url+'"> Visit </a>'+
                        '<a onclick = "deleteBookmark(\''+url+'\')" class = "btn btn-danger"  href="#"> Delete </a>'+
                        '</h3>'+
                        '</div>';

    }
}

// to validate form
function validateForm(siteName,siteURL)
{
    if(!siteName || !siteURL){
        alert('Please fill in the form!');
        return false;
    }

    var expression = /[-a-zA-Z0-9@:%_\+.~#?&//=]{2,256}\.[a-z]{2,4}\b(\/[-a-zA-Z0-9@:%_\+.~#?&//=]*)?/gi;
    var regex = new RegExp(expression);

    if(!siteURL.match(regex)){
        alert('Please use a valid url!');
        return false;
    }
    return true;
}
