import os

def renamefile():
           file_list=os.listdir(r"C:\Users\EngD\Desktop\«·„‰Õ…\Projects\Lesson17_Message Project\prank")
           saved_path=os.getcwd()
           print ("Current Working Directory is : "+saved_path)
           os.chdir(r"C:\Users\EngD\Desktop\«·„‰Õ…\Projects\Lesson17_Message Project\prank")
           for file_name in file_list:
                      print("old_name: "+file_name)
                      print("New_name: "+file_name.translate(None,"0123456789"))
                      os.rename(file_name,file_name.translate(None,"0123456789"))
           os.chdir(saved_path)
          
renamefile()
