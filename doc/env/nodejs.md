#[Installing Node Js](https://tecadmin.net/install-nodejs-with-nvm/)

> Install curl

```bash 
sudo apt update && sudo apt install curl
```

> Get nvm install.sh and run with bash

```bash 
curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash
```

> Reload enviroment variables in ~/.profile

```bash
source ~/.profile
```

> Reload enviroment variables in ~/.bashrc

```bash
source ~/.bashrc
```

> Install latest npm and lts version

```bash
nvm install --latest-npm --lts=dubnium
```

> Check installation by calling node version

```bash
node -v
```