# LeaveCmd
Universal leave command for spigot 1.16+

Instead of players needing to remember /hg leave or /bw leave, they can just use /leave.
The plugin decides what command to use based on the world the player is in.

### Commands / Permissions

| Command            | Description            | Permission        |
|--------------------|------------------------|-------------------|
| `/leave`           | Leave the current game | `leaveCmd.leave`  |
| `/leavecmd reload` | Reload the config      | `leavecmd.relaod` |


### Configuration
`/leave` will match against the first key that is a substring of the wold name.

```yaml
commands:
  "HG-": "hg leave"
```
