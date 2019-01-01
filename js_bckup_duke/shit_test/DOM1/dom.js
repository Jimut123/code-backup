// Examine the document object //

//console.dir(document);

// console.log(document.domain);
// console.log(document.URL);
// console.log(document.title);
// //document.title = 123;
// //console.log(document.title);
// console.log(document.doctype);
// console.log(document.head);
// console.log(document.body);
// console.log(document.all);
// console.log(document.all[10]);
// //document.all[10].textContent='Hello';
// console.log(document.forms);
// console.log(document.links);

// console.log(document.images);

// // Get element by ID
// //console.log(document.getElementById('header-title'));
// var headerTitle = document.getElementById('header-title');
// console.log(headerTitle);
// headerTitle.textContent = 'Hello';
// //headerTitle.innerText = 'googbye'

// var items = document.getElementsByClassName('list-group-item');
// console.log(items);
// console.log(items[2]);
// items[2].textContent = "HELLO";
// items[2].style.fontWeight = 'bold';
// items[2].style.backgroundColor = 'yellow';
// for(var i = 0;i<items.length;i++){
//     items[i].style.backgroundColor='gray';
// }

// var li = document.getElementsByTagName('li');
// console.log(li);
// console.log(li[2]);
// li[2].textContent = "HELLO";
// li[2].style.fontWeight = 'bold';
// li[2].style.backgroundColor = 'yellow';
// for(var i = 0;i<li.length;i++){
//     li[i].style.backgroundColor='gray';
// }

var header = document.querySelector('main-header');
header.style.borderBottom = 'solid 4px #ccc';