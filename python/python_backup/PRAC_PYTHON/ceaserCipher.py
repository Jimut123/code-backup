class ceaserCipher:

    def __init__(self):
        self.encoded_text=""
        self.decoded_text=""
    
    def encode(self,some_text,key):
        for iter in str(some_text):
            #print(iter)
            t = chr(ord(iter)+int(key))
            if t>'z' and iter.islower():
                t = chr(ord(t) - ord('z') + ord('a'))
            if t>'Z' and iter.isupper():
                t = chr(ord(t) - ord('Z') + ord('A'))
            self.encoded_text = self.encoded_text + t
        return self.encoded_text
    
    def decode(self,some_text,key):
        for iter in str(some_text):
            t = chr(ord(iter)-int(key))
            if t<'a' and iter.islower():
                t = chr(ord(t) + ord('z') - ord('a')) + 1
            if t<'A' and iter.isupper():
                t = chr(ord(t) + ord('Z') - ord('A')) + 1
            self.decoded_text = self.decoded_text + t
        return self.decoded_text
    

if __name__ == "__main__":
    cipher = ceaserCipher()
    print(cipher.encode("zzz",4))
    print(cipher.decode("eee",5))