# dictionary = A changeable ,unorder collection of unique key: value
# pairs Fasr because they use hashing allow us to avccess a value quickly
capitals = {'USA':'Washington DC',
            'India':'New Delhi',
            'China': 'Beifying',
            'Russia':'Moscow'}

# print(capitals['Russia'])
print(capitals.get('Nepal'))
print(capitals.keys())
print(capitals.values())
capitals.update({'Nepal':'Kathmandu'})
capitals.update({'USA':'Las Vegas'})
capitals.pop('China')
# print(capitals.items())
for key,value in capitals.items():
    print(key,value)

