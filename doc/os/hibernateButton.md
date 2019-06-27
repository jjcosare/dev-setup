#How To Add Hibernate Button

###### Followed by [UbuntuHandbook](http://ubuntuhandbook.org/index.php/2018/05/add-hibernate-option-ubuntu-18-04/)

#### Check if hibernate is available

1. Go to terminal, or `Ctrl+Alt+T`

2. run command:<br/> `sudo systemctl hibernate` or `sudo pm-hibernate`

(If hibernate does not work, check [this answer in ubuntu](https://askubuntu.com/questions/768136/how-can-i-hibernate-on-ubuntu-16-04/819891#819891))

#### Pre-requisite Hibernate in Menus

1. Back to terminal, run command:<br/> `sudo gedit /etc/polkit-1/localauthority/50-local.d/com.ubuntu.enable-hibernate.pkla
 `
 
2. A file should open. Paste this content in the file and save.
```
[Re-enable hibernate by default in upower]
Identity=unix-user:*
Action=org.freedesktop.upower.hibernate
ResultActive=yes

[Re-enable hibernate by default in logind]
Identity=unix-user:*
Action=org.freedesktop.login1.hibernate;org.freedesktop.login1.handle-hibernate-key;org.freedesktop.login1;org.freedesktop.login1.hibernate-multiple-sessions;org.freedesktop.login1.hibernate-ignore-inhibit
ResultActive=yes
```


#### Gnome Shell Extensions
1. If you don't have this yet, go to your browser's add-ons, search and install _**GNOME Shell integration**_.
    - Chrome: [Web Store](https://chrome.google.com/webstore/detail/gnome-shell-integration/gphhapmejobijbbhgpjhcjognlahblep)
    - Firefox: [Mozilla Addons](https://addons.mozilla.org/en-US/firefox/addon/gnome-shell-integration/)

(More info from [UbuntuHandbook's quick tip](http://ubuntuhandbook.org/index.php/2017/10/install-gnome-extensions-ubuntu-17-10/))
   

#### Enable Hibernate in Menus
1. Go to [Hibernate Status Button](https://extensions.gnome.org/extension/755/hibernate-status-button/)

2. Click the toggle switch from `OFF` to `ON`.