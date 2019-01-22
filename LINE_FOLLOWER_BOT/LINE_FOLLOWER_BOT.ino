// LINE FOLLOWER BOT

int IR1 = 12;                                                             //IR1 right side (D6)
int IR2 = 14;                                                             //IR2 left side (D5)
void setup(){ 
  pinMode(5,OUTPUT);                                                      //Pin 5(D1) & 4(D2) are for Left Motor
  pinMode(4,OUTPUT);
  pinMode(0,OUTPUT);                                                      //Pin 0(D3) & 2(D4) are for Right Motor
  pinMode(2,OUTPUT);
  pinMode(IR1,INPUT);
  pinMode(IR2,INPUT);
}
void loop(){    
  if(digitalRead(IR1)==HIGH && digitalRead(IR2)==HIGH){                   //MOVING FORWARD  
     digitalWrite(0,HIGH);
     digitalWrite(2,LOW);
     digitalWrite(5,HIGH);
     digitalWrite(4,LOW);
  }
  else if(digitalRead(IR1)== LOW && digitalRead(IR2)== HIGH){             //MOVING RIGHT  
     digitalWrite(0,LOW);
     digitalWrite(2,LOW);
     digitalWrite(5,HIGH);
     digitalWrite(4,LOW);
  }
  else if(digitalRead(IR1)== HIGH && digitalRead(IR2)==LOW){              //MOVING LEFT
     digitalWrite(0,HIGH);
     digitalWrite(2,LOW);
     digitalWrite(5,LOW);
     digitalWrite(4,LOW);
  }
  else if(digitalRead(IR1)==LOW && digitalRead(IR2)==LOW){                //STOP
     digitalWrite(0,LOW);
     digitalWrite(2,LOW);
     digitalWrite(5,LOW);
     digitalWrite(4,LOW);
  }
}
