class Employee:
    def __init__(self, name, base_salary, experience):
        self.name = name
        self.base_salary = base_salary
        self.experience = experience
    def Einfo(self, name, base_salary, experience):
        self.name = str(input("Enter the employee name: "))
        self.base_salary = float(input(f"Enter the base salary for {self.name}: "))
        self.experience = int(input(f"Enter {self.name} experience: "))

class Hrsalary(Employee):
    def __init__(self, name):
        self.name = name
    def eesalary(self):
        monthly_salary = 0
        htsalary = float(input(f"Enter the Hr Salary for {self.name}: "))
        hr = int(input(f"Enter No of Hr {self.name} worked: "))
        monthly_salary = htsalary * hr
        print(f"Total salary of {self.name} is", monthly_salary)

    def Experience_emp(self, base_salary):
            if self.experience < 8:
                print(f"The base salary for {self.name} is", base_salary)
            if self.experience > 15:
                print(f"The base salary for {self.name} is", base_salary)
                print(f"The bonus salary for {self.name} is", 500)

class Taxes(Hrsalary):
    def tax(self,ttax, monthly_salary):
        ttax = float(monthly_salary * 0.13)
        print(f"Total salary of {self.name} is", monthly_salary)
#class Experience_emp(Employee):


eb = Employee("", 0, 1)
eb.Einfo("",0,1)
rc = Hrsalary("")
rc.eesalary()
rc.Experience_emp()





