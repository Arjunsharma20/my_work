# set = collectiom which is unodrder unindexed. No duplicate value

utensils = {"fork","spoon","knife","knife"}
dishes = {"bowl","plate","cup"}
# utensils.add("napkins")
# utensils.remove("fork")
# dishes.update(utensils)
dinner_table = utensils.difference(dishes)

for x in dinner_table:
    print(x)