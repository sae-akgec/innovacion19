,// LED Blinking
int LED = 13;                                // connect LED at GPIO pin 13 (D7)

void setup(){
  pinMode(LED , OUTPUT);                     // make LED as OUTPUT
}
void loop(){
  digitalWrite(LED , HIGH);                  // LED is ON 
  delay(250);                                // LED is ON for 1000 miliseconds
  digitalWrite(LED , LOW);                   // LED is OFF
  delay(250);                                // LED is OFF for 1000 miliseconds
}s
