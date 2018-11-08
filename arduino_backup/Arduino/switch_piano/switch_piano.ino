int button_C = 2;
int button_D = 3;
int button_E = 4;
int button_F = 5;


int speaker = 13;

int buttonstate_C = 0;
int buttonstate_D = 0;
int buttonstate_E = 0;
int buttonstate_F = 0;


int tones[] = { 1900, 1500, 1200, 900 }; //frequencies
int Cur_tone = 0;

void setup()
{
  pinMode(button_C, INPUT);
  pinMode(button_D, INPUT);
  pinMode(button_E, INPUT);
  pinMode(button_F, INPUT);


  pinMode(speaker, OUTPUT);
}

void loop()
{
  buttonstate_C = digitalRead(button_C);
  buttonstate_D = digitalRead(button_D);
  buttonstate_E = digitalRead(button_E);
  buttonstate_F = digitalRead(button_F);


  if((buttonstate_C == HIGH) || (buttonstate_D == HIGH) || 
    (buttonstate_E == HIGH) || (buttonstate_F == HIGH)) 
  { 
    if (buttonstate_C == HIGH)
    {
      Cur_tone = tones[0];
    } 
    if (buttonstate_D == HIGH)
    {
      Cur_tone = tones[1];
    }
    if (buttonstate_E == HIGH)
    {
      Cur_tone = tones[2];
    }
    if (buttonstate_F == HIGH)
    {
      Cur_tone = tones[3];
    }

    

    digitalWrite(speaker, HIGH);
    delayMicroseconds(1000);
    digitalWrite(speaker, LOW);
    delayMicroseconds(1000);
  }
  else 
  {
    digitalWrite(speaker, LOW);
  }

}
