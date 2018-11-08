int ranNum;
int ranDel;
void setup() {
randomSeed(analogRead(0));

pinMode(9, OUTPUT);
pinMode(10, OUTPUT);
pinMode(11, OUTPUT);


}
void loop() {
    //Generate random number between 8 and 10
    ranNum=random(1,3);
    // Generate random delay time
    ranDel=random(25,300);
    //Turn on the LED
    digitalWrite(ranNum, HIGH);
    delay(ranDel);
    //Turn off the LED
    digitalWrite(ranNum, LOW);  
}
