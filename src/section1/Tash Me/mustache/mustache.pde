PImage mustache;
PImage friend;
void setup() {
  mustache=loadImage("mustache.png"); 
  friend = loadImage("thedarklord.jpeg");
  size(800,600);
  friend.resize(800,600);
}
void draw () {
  background(friend);
  if (mousePressed) {
  mustache.resize(150,150);
  image(mustache,mouseX,mouseY);
  }
}
