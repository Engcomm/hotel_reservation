import turtle, time

hangman = turtle.Turtle()

def draw_hangman(count):
    if count >= 1:
        hangman.circle(45)
    if count >= 2:   
        hangman.right(90)
    if count == 3:
        hangman.forward(150)
    time.sleep(3)

draw_hangman(3)
