
class Car:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self):
        print(f"{self.manufacturer} {self.model} is moving")

    def stop(self):
        print(f"{self.manufacturer} {self.model} has stopped")


car1 = Car("Toyota", "Corolla", 2022, "Automatic", "Red")
car2 = Car("Honda", "Civic", 2021, "Manual", "Blue")
car3 = Car("Ford", "Mustang", 2023, "Automatic", "Black")


car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()

car3.accelerate()
car3.stop()
