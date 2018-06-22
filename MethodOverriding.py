class Parent():
   def __init__(self,last_name,eye_color):
      print ("Parent Constructor Called")
      self.last_name=last_name
      self.eye_color=eye_color


   def show_info(self):
      print("last_name")
      print()
      
class Child(Parent):
   def __init__(self,last_name,eye_color,number_of_toys):
      print ("Child Constructor Called")
      Parent.__init__(self,last_name,eye_color)
      self.number_of_toys=number_of_toys



      
      
billy_cyrus=Parent("Cyrus","blue")
#print (billy_cyrus.last_name)
#print (billy_cyrus.eye_color)
john_kolly=Child("Kolly","green",5)
#print (john_kolly.last_name)

