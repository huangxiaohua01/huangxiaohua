
function start(){
    $("input[type='text']").each(function(){
        $(this).blur(function(){
            if($(this).val()==""){
                $(this).next().html("必填")
                $(this).next().css("color","red")
                return false
            }
            else{
                $(this).next().html("正确")
                $(this).next().css("color","green")
                return true
            }
        })
    })

};
function validateAll(){
    var result=0
    $("input[type='text']").each(function(){
        if($(this).val()==""){
            $(this).next().html("必填")
            $(this).next().css("color","red")
        }
        else{
            $(this).next().html("正确")
            $(this).next().css("color","green")
            result++
        }
    })
    if(result== $("input[type='text']").length){
        return true
    }else{
        return false
    }
}