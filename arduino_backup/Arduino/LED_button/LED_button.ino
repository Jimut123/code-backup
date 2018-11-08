int button = 2;
int buttonstate = 0;

void setup() {
pinMode(2,INPUT);
pinMode(9, OUTPUT);
pinMode(10, OUTPUT);
pinMode(11, OUTPUT);
}

void loop() {
  buttonstate = digitalRead(button);
  if(buttonstate==HIGH)
  {
  digitalWrite(9, HIGH);
  delay(1000);
  digitalWrite(10, HIGH);
  delay(200);
  digitalWrite(11, HIGH);
  delay(200);
  
  }
  Serial.println(buttonstate);
if(buttonstate==LOW)
  {
  digitalWrite(9, LOW);
  
  digitalWrite(10, LOW);
  
  digitalWrite(11, LOW);
  
    
  }
}
