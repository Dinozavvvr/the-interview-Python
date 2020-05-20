# *********************************************************************************************************** #

class Student:

	def __init__(self, name, lastName, age, course, group):
		self.name = name
		self.lastName = lastName
		self.age = age
		self.course = course
		self.group = group
		self.moreInfo = None

	def print(self):
		return ("Hello! My name is {0}, last name- {1} and I'am {2}.".format(self.name, self.lastName, self.age))

	def setMoreInfo(self,info):
		self.moreInfo = info

	def printInfoAboutStudent(self):
		
		print(self.print() + " " + self.moreInfo)

# *********************************************************************************************************** #

dinar = Student("Dinar", "Shagaliev", 18, 1, "11-904")

dinar.setMoreInfo("I like to write beautifull code) But I know Python less than I would like(((")
dinar.printInfoAboutStudent()
