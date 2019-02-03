import asyncio

async def test_fun(name, number):
    print("{} - {}".format(name,number))

async def main():
    await asyncio.gather(
        #for item in range(100):
        #    test_fun(item,item)
        
        #test_fun(1,1),
        #test_fun(2,2),
    )

asyncio.run(main())