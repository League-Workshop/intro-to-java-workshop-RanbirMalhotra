PImage mustache;
PImage friend;
void setup() {
friend = loadImage("friend.png");
size(800, 600);
friend.resize(width,height);
mustache = loadImage("mustache.jpg");
}

void draw() {
background(friend);
image(mustache, 150, 400);
}
