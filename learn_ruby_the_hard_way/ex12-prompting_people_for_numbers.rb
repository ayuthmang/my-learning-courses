# Exercise 12: Prompting People for Numbers

print "Give me a number: "
number = gets.chomp.to_i

bigger = number * 100
puts "A bigger number is #{bigger}."

print "Give me another number: "
another = gets.chomp
number = another.to_i

smaller = number / 100
puts "A smaller number is #{smaller}."

# print "Give me a money: "
# money = gets.chomp.to_f
# money_back = money * 0.1
# print "Crash back #{money_back}"
# print "Crash back %0.2f" % [money_back]