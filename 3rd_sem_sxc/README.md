
# commands that we forget
```
du -hs :: for finding the total size of the files
```

```
rm -r '.*cpp' :: to remove all files with .cpp extensions

find . -name "*.bak" -type f -delete :: to delete all the files with .bak extensions

find . -name "*.bak" -type f :: to find and show all the files with .bak extensions and finding it recursively

find . -type f  ! -name "*.?*" -delete :: to delete all the files with no extensions, include hash with githubs


```
```
find . -name '*.mkv' -type f -exec chmod 755 {} \;  :: to change the permisiions of all the file at once of this type
```







