#Backup 

####Steps

> Open 'Disks' application

```bash
gnome-disks
```

> Select your `500gb HD` then view details regarding `UUID`

`UUID {500gb-uuid-string}`

> Open your `fstab`

```bash
sudo gedit /etc/fstab
```

> Check your `{500gb-uuid-string}`, add/replace your `fstab` `{500gb-uuid-string}` details with below:

```bash
# 500gb data backup
UUID={500gb-uuid-string}  /media/data    ext4    relatime,noexec  0  2
```

> Save and close `gedit`

<br />

> Restart PC

<br />

> Open terminal and run the command:

```bash
sudo chown {yourhomefolder}:{yourhomefolder} /media/data
```

> Create folder ".bak" on your `500gb HD` 

```bash
mkdir /media/data/.bak
```

> Open `Backups` application 

<br />

> Goto `Storage location` menu 

<br />

> Set `Storage location` to `Local Folder` 

<br />

> Set `Folder` to `/media/data/.bak` 

<br />

> Goto `Scheduling` menu 

<br />

> Set `Automatic backup` to `ON` 

<br />

> Set `Every` to `Day` 

<br />

> Set `Keep` to `At least six months` 

<br />

> Restart PC

<br />

> To test backup, goto `Overview` menu then click `Backup Up Now...` 
