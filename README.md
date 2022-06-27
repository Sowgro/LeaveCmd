# LeaveCmd
Universal leave command for spigot 1.19

Instead of players needing to remember /hg leave or /bw leave, they can just use /leave.
The plugin decides what command to use based on the world the player is in.

## Commands:
- /leave
- /leavecmd reload

## Permissions:
- leaveCmd.leave
- leaveCmd.admin

## Config:
    commands:
      //ex: "command"
      //hg: "hungergames leave"

    worlds:
      //world: ex
      //arena: hg
