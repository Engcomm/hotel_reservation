import turtle

def draw_square(sh):
    for i in range(1,5):
      sh.forward(100)
      sh.right(90)


def draw_art():
   window=turtle.Screen()
   window.bgcolor("blue")
   e=turtle.Turtle()
   e.speed(20)
   e.shape("arrow")
   e.color("yellow")
   
   for j in range (1,60):
      draw_square(e)
      e.right(6)
      
   window.exitonclick()
   
draw_art()     
