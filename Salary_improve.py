class Employee:
    def __init__(self, name,experience):
        self.name = name
        self.experience = experience

    #def display(self):
       # print(f"Name: {self.name}, has", {self.experience},"years of experience")


class Hrsalary(Employee):
    def __init__(self, name, experience):
        Employee.__init__(self, name,experience)
        self.monthly_salary = 0
        htsalary = float(input(f"Enter the Hr Salary for {self.name}: "))
        hr = int(input(f"Enter No of Hr {self.name} worked: "))
        self.monthly_salary = htsalary * hr


    def Experience_emp(self):
            if self.experience < 8:
                self.bonus = 0
            elif self.experience <= 15:
                self.bonus = 100
            else:
                self.bonus = 500

    def display(self):
        print(f"The employee: {self.name}, earned {self.monthly_salary}, plus the bonus of: {self.bonus}")

#class Taxes(Hrsalary):
   # def __init__(self):
        #self.monthly_salary = monthly_salary
        #self.ttax = ttax
        #self.Total_salary = Total_salary

    def tax(self):
        self.Total_salary = float(self.monthly_salary + self.bonus)
        self.ttax = float(self.Total_salary * 0.13)
        self.Total_salary = float(self.Total_salary - self.ttax)
        print(f"Net salary of {self.name} is", self.Total_salary)
        print(f"The taxes for {self.name} are: ", self.ttax)

    #def display(self):
        #Employee.display(self)
        #print(f"Total marks: {self.total_m}")
        #print(f"Total percentage: {self.total_percentage}%")
        #print(f"Grade: {self.rsalary}")



name = input("Enter employee name: ")
experience = int(input("Enter Employee experience:"))
eb = Hrsalary(name,experience)
eb.Experience_emp()
eb.display()
#eb1 = Taxes()
eb.tax()





