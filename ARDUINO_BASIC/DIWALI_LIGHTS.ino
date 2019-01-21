// DIWALI LIGHTS 

int ledOne = 5;
int ledTwo = 15;
int ledThree = 14;
int ledFour = 12;
int ledFive = 13;
void setup()
{
  pinMode(ledOne , OUTPUT);
  pinMode(ledTwo , OUTPUT);
  pinMode(ledThree , OUTPUT);
  pinMode(ledFour , OUTPUT);
  pinMode(ledFive , OUTPUT);
}
void loop()
{
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
