$(document).ready(function(){
  var head = function(){
    scrollTop = $(window).scrollTop();
    if(scrollTop>0){
      $('#H').addClass('shadow');
      $('#H').addClass('whiteb');
      $('#H').removeClass('wtext');
      $('#icon').removeClass('big');
      $('#icon').addClass('small'); 
    }else{
      $('#H').removeClass('shadow');
      $('#H').removeClass('whiteb');
      $('#H').addClass('wtext');
      $('#icon').removeClass('small');
      $('#icon').addClass('big');
    }
  };
  $(window).scroll(function() {
	  head();
  });
});
