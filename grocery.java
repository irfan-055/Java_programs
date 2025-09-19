import datetime


items = ["Rice", "Sugar", "Oil", "Soap", "Milk"]
prices = [50, 40, 100, 25, 30]


def calculate_total(quantities):
    total = sum(prices[i] * quantities[i] for i in range(len(items)))
    if total > 500:
        discount = total * 0.10
        total -= discount
        print(f"\nDiscount Applied: Rs.{discount:.2f}")
    return total


print("Welcome to the Grocery Store!")
print("Available items:")
for i in range(len(items)):
    print(f"{items[i]} - Rs.{prices[i]} per unit")


quantities = []
for item in items:
    while True:
        try:
            qty = int(input(f"Enter quantity for {item}: "))
            if qty < 0:
                raise ValueError("Quantity cannot be negative.")
            quantities.append(qty)
            break
        except ValueError as e:
            print(f"Invalid input: {e}. Please enter a valid number.")


final_amount = calculate_total(quantities)
print(f"\nTotal Amount to Pay: Rs.{final_amount:.2f}")


now = datetime.datetime.now()
print(f"Purchase Date & Time: {now.strftime('%d-%m