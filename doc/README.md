# dev-setup

> Convention for adding images

1. Add a folder with the same name as the topic
`ubuntu.md = ubuntu folder`
2. Reference your image with `![ubuntu icon](ubuntu/icon.png?raw=true)`

# Pre-requisite for using gitbook

> Please install the following using instructions on https://jjcosare.github.io/dev-setup

1. [Git](env/git.md)
2. [Github](env/github.md)
3. [NodeJS](env/nodejs.md)
4. [GitBook](env/gitbook.md)


> Make publishDoc*.sh executable

```bash
chmod +x publishDoc*.sh
```

#How to publish this gitbook to localhost

> Run publishDocDev.sh

```bash
./publishDocDev.sh
```

> On intellij, Goto `_book` folder and right click `index.html` then `Open in Browser > Default` to view updated doc

#How to publish this gitbook to github.io

> Run publishDocProd.sh

```bash
./publishDocProd.sh
```

> Your default browser will open `https://jjcosare.github.io/dev-setup`, refresh this after a few minutes to see your changes reflected
