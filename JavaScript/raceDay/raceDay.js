let raceNumber = Math.floor(Math.random() * 1000);
var registeredEarly = true;
var runnersAge = 26

if (runnersAge >= 18 && registeredEarly) {
    raceNumber += 1000
} else if (runnersAge >= 18 && registeredEarly === false) {
    console.log(`Your race number is ${raceNumber} and you will race at 11am.`);
} else if (runnersAge < 18) {
    console.log(`Your race number is ${raceNumber} and you will race at 12:30pm.`)
} else {
    console.log('Please see the registration desk');
}

if (runnersAge >= 18 && registeredEarly) {
    console.log(`Your race number is: ${raceNumber} and you will race at 9:30am.`);
}
