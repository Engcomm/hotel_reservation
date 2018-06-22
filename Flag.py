import turtle

turtle.shape("arrow")
window=turtle.Screen()
window.bgcolor("white")
window.setup(width=0.5,height=0.5,startx=None,starty=None)

turtle.begin_fill()
turtle.color("red")

for i in range(2):
   turtle.forward(200)
   turtle.left(90)
   turtle.forward(100)
   turtle.left(90)
turtle.end_fill()

turtle.begin_fill()
turtle.color("white")
turtle.right(90)
turtle.forward(100)

turtle.begin_fill()
turtle.color("black")
for i in range(2):
   turtle.forward(100)
   turtle.left(90)
   turtle.forward(200)
   turtle.left(90)
turtle.end_fill()

#turtle.right(-90)
#turtle.forward(90)
#turtle.color("yellow")
#turtle.forward(30)
#turtle.left(90)
#turtle.forward(20)
#turtle.left(90)
#turtle.forward(30)
#turtle.left(90)
#turtle.forward(20)
#turtle.left(180)
#turtle.forward(20)
#turtle.right(120)
#turtle.circle(60,-120)

turtle.right(-90)
turtle.forward(100)
turtle.up()


e = turtle.Turtle()
e.shape("arrow")
e.color("black")
e.speed(2)
e.backward(20)
e.right(90)
e.forward(50)
e.left(90)
e.forward(80)
e.backward(80)
e.left(90)
e.forward(75)
e.right(90)
e.forward(70)


 
window.exitonclick()
