import urllib

def read_text():
   quotes=open("C:\Users\EngDalia\Desktop\«·„‰Õ…\Projects\Lesson20_ProfanityEditor\movie_quotes\movie_quotes.txt")
   contnts_of_file=quotes.read()
   print (contnts_of_file)
   quotes.close()
   check_profanity(contnts_of_file)

def check_profanity(text_to_check):
   connection=urllib.urlopen("http://www.wdylike.appspot.com/?q="+text_to_check)
   output=connection.read()
   print (output)
   connection.close()
   if "true" in output :
      print ("Profanity Alert!!!!!")
   elif "false" in output :
      print ("This document hasn't curse words.")
   else:
      print ("Couldn't scan the document properly.")
   





read_text()
