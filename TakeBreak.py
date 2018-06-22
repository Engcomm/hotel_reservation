import time
import webbrowser

total_breaks=3
count=0
print ("This programe started on: "+time.ctime())
while count < total_breaks:
           time.sleep(2*60*60)
           webbrowser.open("https://www.youtube.com/watch?v=9g_JsE1gWTE")
           count+=1
           

