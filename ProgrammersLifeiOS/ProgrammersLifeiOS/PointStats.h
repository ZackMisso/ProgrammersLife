//
//  PointStats.h
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface PointStats : NSObject{
    int brainPoints;
    int checkPoints;
    int starPoints;
}

// getter methods
-(int)getBrainPoints;
-(int)checkPoints;
-(int)starPoints;

// setter methods
-(void)setBrainPoints:(int)value;
-(void)setCheckPoints:(int)value;
-(void)setStarPoints:(int)value;

@end
