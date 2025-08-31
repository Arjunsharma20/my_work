# class Employee:
#     language = "Python"
#     salary = 120000


# arjun = Employee()
# print(arjun.language,arjun.salary)


# second class
class Student:
    course="BCA"
    fees = 200000
    def __init__(self):#dunder method which is automatically call when we creat object
        
        print("Hii")
    def getinfo(self):
        print(f"The course is {self.course} and the fees is {self.fees}")
    @staticmethod
    def greet():
        print("GOod Morning")
        # Static method are those method in which self is not necessary and its does not use argument of class

Arjun=Student()
Arjun.getinfo()
# TypeError: Student.getinfo() takes 0 positional arguments but 1 was given
# Here the error is arise because the compiler  understand that we want 
Student.getinfo(Arjun) #here arjun is 1 argument in the getinfo so overcome this error we take self argument in the function
