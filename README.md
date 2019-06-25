# dev-setup

> Convention for adding images
1. Add a folder with the same name as the topic
`ubuntu.md = ubuntu folder`
2. Reference your image with `![ubuntu icon](ubuntu/icon.png?raw=true)`

# Pre-requisite for using gitbook
> Install gitbook 
```
# please refer to the following installation docs:
1. doc/env/git.md
2. doc/env/github.md
3. doc/env/nodejs.md 
4. doc/env/gitbook.md
```

> Make publishDoc*.sh executable
```
$ chmod +x publishDoc*.sh
```

#How to publish this gitbook to localhost

> Run publishDocDev.sh
```
$ ./publishDocDev.sh
```

> On intellij, Goto `_book` folder and right click `index.html` then `Open in Browser > Default`

#How to publish this gitbook to github.io

> Run publishDocProd.sh
```
$ ./publishDocProd.sh
```

> On browser, open url `https://jjcosare.github.io/dev-setup`
