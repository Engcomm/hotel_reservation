import random
def tripple(x):
   return x*x*x
def squ(x):
   return x*x
def listitems():
   list1=[]
   raw_input("Pls enter ur list items: ")
   for num in range(5):
       list1.append(input())
   print "List Before Sorting:  "+str(list1)
   print "List After Sorting:  "+str(sorted(list1))
   print "------------------------------------------"
   print "Max value in list: "+str(max(list1))
   print "Min value in list: "+str(min(list1))
   print "------------------------------------------"
   print "Sum of list values: "+str(sum(list1))
   print "------------------------------------------"
   print "Reversed list: "+str(list(reversed(list1)))
   print "------------------------------------------"
   print "the squares of each number in list: "
   for num in list1:
      print  str(num)+"---square--->"+str(squ(num))
   print "------------------------------------------"
   print "the tripple of each number in list: "
   for num in list1:
      print  str(num)+"---tripple--->"+str(tripple(num))   
   print "------------------------------------------"
   print "the binary code of each number in list: "
   for num in list1:
      print  str(num)+"---binary--->"+str(bin(num))
listitems()

