#Backup 

> Open 'Disks' application

```bash
gnome-disks
```

> View details (`Device` and `UUID`) on your `500gb HD`

`Device /dev/sdxX`

`UUID ef8037e5-xxxx-xxxx-xxxx-dd49609d0280`

> Open your `fstab`

```bash
sudo gedit /etc/fstab
```

> Add/Replace below details to your `fstab` then save and close `gedit`

```bash
UUID=ef8037e5-xxxx-xxxx-xxxx-dd49609d0280  /media/data    ext4    relatime,noexec  0  2
```

> Remounts all partitions on `fstab` except with `noauto` option

```bash
sudo mount -av
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

> To test backup, goto `Overview` menu then click `Backup Up Now...` 
