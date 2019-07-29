PImage rainbow;
PImage unicorn;
void setup () {
  rainbow=loadImage("rainbow.jpg");
size(800,600);
rainbow.resize(600,600);
background(rainbow);
unicorn=loadImage("unic0rn.png");
}
void draw () {
  background(rainbow);
  image(unicorn, mouseX, mouseY);
}
