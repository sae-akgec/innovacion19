   // IR Sensor

int LED = 12;                             // choose pin GPIO 12 (D6) for the LED
int IRpin = 13;                           // choose input pin GPIO 13(D7) (for Infrared sensor) 
int val = 0;                              // variable for reading the pin status 
void setup(){ 
   pinMode(LED, OUTPUT);                  // declare LED as output 
   pinMode(IRpin, INPUT);                 // declare Infrared sensor as input
} 
void loop(){ 
   val = digitalRead(IRpin);              // read input value 
   if (val == HIGH){                      // check if the input is HIGH 
      digitalWrite(LED, HIGH);            // turn LED ON   
   } 
   else{ 
      digitalWrite(LED, LOW);             // turn LED OFF
   } 
}
