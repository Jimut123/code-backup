#include <Adafruit_GFX.h>
#include <gfxfont.h>



#include <SPI.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>

#define OLED_RESET 4
Adafruit_SSD1306 display(OLED_RESET);


void setup()   {                
  Serial.begin(9600);

  display.begin(SSD1306_SWITCHCAPVCC, 0x3C);  // initialize with the I2C addr 0x3D (for the 128x64)
  
  
  display.display();
  delay(2000);
  display.clearDisplay();

  
  display.drawPixel(10, 10, WHITE);
  display.display();
  delay(2000);
  display.clearDisplay();

  
  text();
  delay(2000);
  display.clearDisplay();


}


void loop()
{}




void text(void) {
  display.setTextSize(1.9999);
  display.setTextColor(WHITE);
  display.setCursor(10,0);
  display.clearDisplay();
  display.println("Hey, sukanta!");
  display.println("  ");
  display.println("  what's up?");
  display.display();
  delay(1);
}
