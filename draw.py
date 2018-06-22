import turtle
def draw_square():
           window=turtle.Screen()
           window.bgcolor("yellow")
           sq=turtle.Turtle()
           sq.shape("turtle")
           sq.color("red")
           sq.speed(3)
           i=0
           while i<4 :
             sq.forward(200)
             sq.right(90)
             i+=1
def draw_tri():
           window=turtle.Screen()
           window.bgcolor("yellow")
           
           tri=turtle.Turtle()
           tri.shape("arrow")
           tri.color("blue")
           j=0
           while j<3:
             tri.forward(200)
             tri.left(120)
             j+=1       
def draw_cir():
           window=turtle.Screen()
           window.bgcolor("yellow")
           cir=turtle.Turtle()
           cir.shape("turtle")
           cir.color("black")
           cir.circle(100)
           window.exitonclick()
           
draw_square()
draw_tri()
draw_cir()

