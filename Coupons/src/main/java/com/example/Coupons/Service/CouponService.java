package com.example.Coupons.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Coupons.Model.Coupon;
import com.example.Coupons.Repository.CouponRepository;

import java.util.List;
import java.util.Optional;


@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;


    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }


    public Coupon addCoupon( Coupon coupon) {
        couponRepository.save(coupon);
        return coupon;
    }


    public String deleteCoupon( String id) {
        couponRepository.deleteById(id);
        return "coupon with id = "+ id +" deleted successfully";
    }

    public Coupon updateCoupon( Coupon coupon,String id) {
        return couponRepository.save(coupon);
    }


    public List<Coupon> findByprovider(String provider)
	{
		return couponRepository.findByprovider(provider);
	}


	public Optional<Coupon> findById(String id) {
		return couponRepository.findById(id);
	}


	public List<Optional<Coupon>> findByCategory(String category) {
		List<Optional<Coupon>> coupon = couponRepository.findByCategory(category);
		return coupon;
	}


	


	
    
    

}
