var y = 100;
var x = 100;
// The statements in the setup() function 
// execute once when the program begins
function setup() {
	// createCanvas must be the first statement
  createCanvas(720, 400);  
  stroke(255);     // Set line drawing color to white
  frameRate(100);
}
// The statements in draw() are executed until the 
// program is stopped. Each statement is executed in 
// sequence and after the last line is read, the first 
// line is executed again.
function draw() { 
  background(0);   // Set the background to black
  y = y - 1; 
  x = x - 1;

  if (y < 0) { 
    y = height; 
  } 
  if (x < 0) { 
    x = width; 
  } 
  //line(0, y, width, y);  
  line(50, 50, x, y);  
} 