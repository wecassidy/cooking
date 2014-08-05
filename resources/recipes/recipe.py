import json

recipeFile = "scrambled-eggs.recipe"

recipe = json.load(open(recipeFile))

ingredients = recipe["ingredients"]
steps = recipe["steps"]

print(recipeFile.strip(".recipe"))
print("=" * len(recipeFile.strip(".recipe")))
print()
print("Ingredients:")
for ingredient, amount in zip(ingredients.keys(), ingredients.values()):
	amountStr = str(amount["amount"]) + (amount["units"] if amount["units"] != None else "")

	print("- " + amountStr + " " + ingredient)
print()
print("-" * len("- " + amountStr + " " + ingredient))
print()

print("Steps:")
for step, stepNum in zip(steps, range(len(steps))):
	print(str(stepNum + 1) + ":")

	for operation in step:
		opName = operation["name"]

		if opName == "add":
			message = "Add the "

