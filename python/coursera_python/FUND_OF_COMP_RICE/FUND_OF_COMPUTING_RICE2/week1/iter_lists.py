def square_list1(numbers):
    """Returns a list of the squares of the numbers in the input."""
    result = []
    for n in numbers:
        result.append(n ** 2)
    return result

def square_list2(numbers):
    """Returns a list of the squares of the numbers in the input."""
    return [n ** 2 for n in numbers]

print square_list1([4, 5, -2])
print square_list2([4, 5, -2])



def is_in_range(ball):
    """Returns whether the ball is in the desired range.  """
    return ball[0] >= 0 and ball[0] <= 100 and ball[1] >= 0 and ball[1] <= 100


def balls_in_range1(balls):
    """Returns a list of those input balls that are within the desired range."""
    result = []
    for ball in balls:
        if is_in_range(ball):
            result.append(ball)
    return result

def balls_in_range2(balls):
    return [ball for ball in balls if is_in_range(ball)]

print balls_in_range1([[-5,40], [30,20], [70,140], [60,50]])
print balls_in_range2([[-5,40], [30,20], [70,140], [60,50]])
