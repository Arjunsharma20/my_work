food = ["pizza","hamburger","hotdog","spaghetti","pudding"]
food[0] = "sushi"
food.append("ice cream")
food.remove("hotdog")
food.pop()
food.insert(0,"cake")
food.sort()
for x in food:
    print(x)

# 2d list = a lsit of a list

drink = ["coffee","milk","tea"]
dinner = ["pizza","hamburger","hotdog"]
dessert = ["cake","ice cream"]
food = [drink,"\n",dinner,"\n",dessert]
print(food[0])
print(food[1])
print(food[2])

