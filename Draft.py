def PygLatin(string):
	try:
		string.isalpha
		strarray = []
		spaceIndex = []
		output = ''
		string = " " + string
		i = 0
		while i < len(string):
			if string[i] == " ":
				spaceIndex = spaceIndex + [i]
				i = i + 1
			else:
				i = i + 1
		spaceIndex = spaceIndex + [len(string)]
		j = 0
		while j < len(spaceIndex) - 1:
			strarray = strarray + [string[spaceIndex[j]:spaceIndex[j + 1]]]
			j = j + 1
		k = 0
		while k < len(strarray):
			if strarray[k][1] in 'aeiou':
				strarray[k] = strarray[k] + "way"
				strarray[k] = strarray[k][1:]
				output = output + strarray[k] + " "
				k = k + 1
			else:
				strarray[k] = strarray[k] + strarray[k][1] + "ay"
				strarray[k] = strarray[k][2:]
				output = output + strarray[k] + " "
				k = k + 1
		output = output[0:len(output)-1]
		print output.lower()
	except AttributeError:
		print "Please enter a string"
    
PygLatin("Pig Latin ahoy there matey")
