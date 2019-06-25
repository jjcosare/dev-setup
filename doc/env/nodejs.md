#[Installing Node Js](https://tecadmin.net/install-nodejs-with-nvm/)

> Get nvm install.sh and run with bash

``` 
$ curl https://raw.githubusercontent.com/creationix/nvm/master/install.sh | bash
```

> Reload enviroment variables in ~/.profile

``` 
$ source ~/.profile
```

> Reload enviroment variables in ~/.bashrc

``` 
$ source ~/.bashrc
```

> Install latest npm and lts version

``` 
$ nvm install --latest-npm --lts=dubnium
```

> Check installation by calling node version

``` 
$ node -v
```