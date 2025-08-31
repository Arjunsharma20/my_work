no = int(input("Enter a number"))
for i in range(2,no):
    if(no%i)==0:
        print("Number is not prime")
        break
else:
    print("Number is prime")