// DIWALI LIGHTS 

int ledOne = 5;                          // connect LED at GPIO pin 5 (D1)
int ledTwo = 4;                          // connect LED at GPIO pin 4 (D2)
int ledThree = 0;                        // connect LED at GPIO pin 0 (D3)
int ledFour = 2;                         // connect LED at GPIO pin 2 (D4)
int ledFive = 14;                        // connect LED at GPIO pin 14 (D5)

void setup(){
  pinMode(ledOne , OUTPUT);
  pinMode(ledTwo , OUTPUT);
  pinMode(ledThree , OUTPUT);
  pinMode(ledFour , OUTPUT);
  pinMode(ledFive , OUTPUT);
}

void loop(){
  digitalWrite(ledOne , HIGH);
  digitalWrite(ledFive , HIGH);
  delay(50); 
  digitalWrite(ledOne , LOW);
  digitalWrite(ledFive , LOW);
  delay(50); 
    
  digitalWrite(ledTwo , HIGH);
  digitalWrite(ledFour , HIGH);
  delay(50); 
  digitalWrite(ledTwo , LOW);
  digitalWrite(ledFour , LOW);
  delay(50); 
    
  digitalWrite(ledThree , HIGH);
  delay(50);
  digitalWrite(ledThree , LOW);
  delay(50);                            
  
  digitalWrite(ledTwo , HIGH);
  digitalWrite(ledFour , HIGH);
  delay(50); 
  digitalWrite(ledTwo , LOW);
  digitalWrite(ledFour , LOW);
  delay(50); 
  
  digitalWrite(ledOne , HIGH);
  digitalWrite(ledFive , HIGH);
  delay(50); 
  digitalWrite(ledOne , LOW);
  digitalWrite(ledFive , LOW);
  delay(50); 
}