
function updateError(msgObj, err) {
    if(err){
        if(!msgObj.classList.contains("error")){
            msgObj.classList.add("error")
        }
    }else{
        if(msgObj.classList.contains("error")){
            msgObj.classList.remove("error")
        }
    }
}

function validateKanjiName1(){
    var obj = document.getElementsByName('kanjiName1')[0]
    var msgObj = obj.parentElement
    var err = obj.value.length > 30
    updateError(msgObj, err)
    return err
}
function validateKanjiName2(){
    var obj = document.getElementsByName('kanjiName2')[0]
    var msgObj = obj.parentElement
    var err = obj.value.length > 30
    updateError(msgObj, err)
    return err
}
function validateKanaName1(){
    var obj = document.getElementsByName('kanaName1')[0]
    var msgObj = obj.parentElement
    var err = obj.value.length > 45 || /^[ァ-ヶー]*$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateKanaName2(){
    var obj = document.getElementsByName('kanaName2')[0]
    var msgObj = obj.parentElement
    var err = obj.value.length > 45 || /^[ァ-ヶー]*$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateAlphabetName1(){
    var obj = document.getElementsByName('alphabetName1')[0]
    var msgObj = obj.parentElement
    var err = obj.value.length > 60 || /^[a-zA-Z]*$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateAlphabetName2(){
    var obj = document.getElementsByName('alphabetName2')[0]
    var msgObj = obj.parentElement
    var err = obj.value.length > 60 || /^[a-zA-Z]*$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}

function validateZipCode1(){
    var obj = document.getElementsByName('zipCode1')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^[0-9]{3}$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateZipCode2(){
    var obj = document.getElementsByName('zipCode2')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^[0-9]{4}$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}

function validateHomePhoneNumber1(){
    var obj = document.getElementsByName('homePhoneNumber1')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^0[0-9]{1,3}$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateHomePhoneNumber2(){
    var obj = document.getElementsByName('homePhoneNumber2')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^[0-9]{2,4}$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateHomePhoneNumber3(){
    var obj = document.getElementsByName('homePhoneNumber3')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^[0-9]{4}$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}

function validateMobilePhoneNumber1(){
    var obj = document.getElementsByName('mobilePhoneNumber1')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^(070|080|090)?$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateMobilePhoneNumber2(){
    var obj = document.getElementsByName('mobilePhoneNumber2')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^([0-9]{4})?$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateMobilePhoneNumber3(){
    var obj = document.getElementsByName('mobilePhoneNumber3')[0]
    var msgObj = obj.parentElement.parentElement.parentElement
    var err = /^([0-9]{4})?$/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}

function validateDebt(){
    var obj = document.getElementsByName('debt')[0]
    var msgObj = obj.parentElement
    var err = /[0-9]+/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}
function validateIncome(){
    var obj = document.getElementsByName('income')[0]
    var msgObj = obj.parentElement
    var err = /[0-9]+/.exec(obj.value) == null
    updateError(msgObj, err)
    return err
}

function validateSubmit(){
    return err
}

